package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameOfficialARIterator theorganization = (organizationNameOfficialARIterator)findAncestorWithClass(this, organizationNameOfficialARIterator.class);
			pageContext.getOut().print(theorganization.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

