package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			if (!theChapter.commitNeeded) {
				pageContext.getOut().print(theChapter.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			return theChapter.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Chapter for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			theChapter.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for subjectURI tag ");
		}
	}
}

