package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCodeDBPediaIDIterator theAcademicArticle = (AcademicArticleCodeDBPediaIDIterator)findAncestorWithClass(this, AcademicArticleCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

