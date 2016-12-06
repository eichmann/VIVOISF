package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			if (!theChapter.commitNeeded) {
				pageContext.getOut().print(theChapter.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			return theChapter.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Chapter for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			theChapter.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for abbreviation tag ");
		}
	}
}

