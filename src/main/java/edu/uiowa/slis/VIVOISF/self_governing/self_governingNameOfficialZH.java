package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameOfficialZHIterator theself_governing = (self_governingNameOfficialZHIterator)findAncestorWithClass(this, self_governingNameOfficialZHIterator.class);
			pageContext.getOut().print(theself_governing.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

