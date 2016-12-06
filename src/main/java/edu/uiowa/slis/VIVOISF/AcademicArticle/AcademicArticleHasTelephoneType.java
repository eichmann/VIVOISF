package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasTelephoneIterator theAcademicArticleHasTelephoneIterator = (AcademicArticleHasTelephoneIterator)findAncestorWithClass(this, AcademicArticleHasTelephoneIterator.class);
			pageContext.getOut().print(theAcademicArticleHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

