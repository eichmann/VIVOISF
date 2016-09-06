package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameOfficialFRIterator theself_governing = (self_governingNameOfficialFRIterator)findAncestorWithClass(this, self_governingNameOfficialFRIterator.class);
			pageContext.getOut().print(theself_governing.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

