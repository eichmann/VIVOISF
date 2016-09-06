package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			if (!theChapter.commitNeeded) {
				pageContext.getOut().print(theChapter.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			return theChapter.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Chapter for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			theChapter.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for label tag ");
		}
	}
}

