package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingNameOfficialFRIterator theNon_self_governing = (Non_self_governingNameOfficialFRIterator)findAncestorWithClass(this, Non_self_governingNameOfficialFRIterator.class);
			pageContext.getOut().print(theNon_self_governing.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

