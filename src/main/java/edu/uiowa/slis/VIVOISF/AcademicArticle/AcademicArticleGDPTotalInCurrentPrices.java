package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleGDPTotalInCurrentPricesIterator theAcademicArticle = (AcademicArticleGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, AcademicArticleGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theAcademicArticle.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

