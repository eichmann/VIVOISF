package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingNameShortENIterator theNon_self_governing = (Non_self_governingNameShortENIterator)findAncestorWithClass(this, Non_self_governingNameShortENIterator.class);
			pageContext.getOut().print(theNon_self_governing.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

