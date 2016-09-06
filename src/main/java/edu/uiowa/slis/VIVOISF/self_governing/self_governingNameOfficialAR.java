package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameOfficialARIterator theself_governing = (self_governingNameOfficialARIterator)findAncestorWithClass(this, self_governingNameOfficialARIterator.class);
			pageContext.getOut().print(theself_governing.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

