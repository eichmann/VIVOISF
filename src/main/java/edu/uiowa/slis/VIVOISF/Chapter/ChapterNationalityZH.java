package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNationalityZHIterator theChapter = (ChapterNationalityZHIterator)findAncestorWithClass(this, ChapterNationalityZHIterator.class);
			pageContext.getOut().print(theChapter.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

