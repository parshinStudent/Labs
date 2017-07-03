using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace Notepad
{
    public partial class blank : Form
    {
        private string DocName = "";
        private bool IsSaved = false;

        public bool _getIsSaved()
        {
            return IsSaved;
        }
        public void _setIsSaved(bool temp)
        {
            IsSaved = temp;
        }

        public blank()
        {
            InitializeComponent();
            sbTime.Text = Convert.ToString(System.DateTime.Now.ToLongTimeString());
            //В тексте всплывающей подсказки выводим текущую дату
            sbTime.ToolTipText =
            Convert.ToString(System.DateTime.Today.ToLongDateString());
        }

        public string _getDocName()
        {
            return DocName;
        }
        public void _setDocName(string name)
        {
            DocName = name;
        }
        public void _cut()
        { 
            richTextBox1.Cut();
        }
        public void _copy()
        {
            richTextBox1.Copy();
        }
        public void _paste()
        {
            richTextBox1.Paste();
        }
        public void _selectAll()
        {
            richTextBox1.SelectAll();
        }
        public void _delete()
        {
            richTextBox1.SelectedText = "";
        }

        private void cutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            _cut();
        }

        private void copyToolStripMenuItem_Click(object sender, EventArgs e)
        {
            _copy();
        }

        private void pasteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            _paste();
        }

        private void deleteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            _delete();
        }

        private void selectAllToolStripMenuItem_Click(object sender, EventArgs e)
        {
            _selectAll();
        }

        public void _open(string OpenFileName)
        {
            if (OpenFileName == "")
            {
                return;
            }
            else
            {
                StreamReader sr = new StreamReader(OpenFileName);
                richTextBox1.Text = sr.ReadToEnd();
                sr.Close();
                DocName = OpenFileName;
            }
        }

        public void _save(string SaveFileName)
        {
            if (SaveFileName == "")
            {
                return;
            }
            else
            {
                //Создаем новый объект StreamWriter и передаем ему переменную //OpenFileName
                StreamWriter sw = new StreamWriter(SaveFileName);
                //Содержимое richTextBox1 записываем в файл
                sw.WriteLine(richTextBox1.Text);
                //Закрываем поток
                sw.Close();
                //Устанавливаем в качестве имени документа название сохраненного файла
                DocName = SaveFileName;
            }
        }

        private void blank_FormClosing(object sender, FormClosingEventArgs e)
        {
            //Если переменная IsSaved имеет значение true, т. е. новый документ
            //был сохранен (Save As) или в открытом документе были сохранены изменения (Save),
            //то 
                //выполняется условие
                if (IsSaved == true)
                //Появляется диалоговое окно, предлагающее сохранить документ.
                if (MessageBox.Show("Do you want save changes in " + this.DocName + "?",
                "Message", MessageBoxButtons.YesNo,
                MessageBoxIcon.Question) == DialogResult.Yes)
                //Если была нажата кнопка Yes, вызываем метод Save
                {
                    this._save(this.DocName);
                }
        }

        public RichTextBox _getTextBox()
        {
            return richTextBox1;
        }

        private void richTextBox1_TextChanged(object sender, EventArgs e)
        {
            sbAmound.Text = "Аmount of symbols: " + richTextBox1.Text.Length.ToString();
        }
    }
}
