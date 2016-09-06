package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameOfficialESIterator theself_governing = (self_governingNameOfficialESIterator)findAncestorWithClass(this, self_governingNameOfficialESIterator.class);
			pageContext.getOut().print(theself_governing.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

