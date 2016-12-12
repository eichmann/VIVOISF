package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingNameListFRIterator theNon_self_governing = (Non_self_governingNameListFRIterator)findAncestorWithClass(this, Non_self_governingNameListFRIterator.class);
			pageContext.getOut().print(theNon_self_governing.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

