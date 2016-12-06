package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasAddressIterator theAcademicArticleHasAddressIterator = (AcademicArticleHasAddressIterator)findAncestorWithClass(this, AcademicArticleHasAddressIterator.class);
			pageContext.getOut().print(theAcademicArticleHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

