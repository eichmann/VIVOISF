package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameOfficialITIterator theself_governing = (self_governingNameOfficialITIterator)findAncestorWithClass(this, self_governingNameOfficialITIterator.class);
			pageContext.getOut().print(theself_governing.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

