package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030NameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030NameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030NameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030NameOfficialESIterator theIAO_0000030 = (IAO_0000030NameOfficialESIterator)findAncestorWithClass(this, IAO_0000030NameOfficialESIterator.class);
			pageContext.getOut().print(theIAO_0000030.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

