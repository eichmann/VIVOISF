package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030NameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030NameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030NameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030NameOfficialZHIterator theIAO_0000030 = (IAO_0000030NameOfficialZHIterator)findAncestorWithClass(this, IAO_0000030NameOfficialZHIterator.class);
			pageContext.getOut().print(theIAO_0000030.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

