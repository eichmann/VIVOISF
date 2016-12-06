package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			if (!theChapter.commitNeeded) {
				pageContext.getOut().print(theChapter.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			return theChapter.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Chapter for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			theChapter.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for hideFromDisplay tag ");
		}
	}
}

