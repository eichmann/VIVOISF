package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingAgriculturalAreaTotalIterator theNon_self_governing = (Non_self_governingAgriculturalAreaTotalIterator)findAncestorWithClass(this, Non_self_governingAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theNon_self_governing.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

