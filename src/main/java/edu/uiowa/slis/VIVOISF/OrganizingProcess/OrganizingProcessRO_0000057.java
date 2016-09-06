package edu.uiowa.slis.VIVOISF.OrganizingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizingProcessRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizingProcessRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizingProcessRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizingProcessRO_0000057Iterator theOrganizingProcessRO_0000057Iterator = (OrganizingProcessRO_0000057Iterator)findAncestorWithClass(this, OrganizingProcessRO_0000057Iterator.class);
			pageContext.getOut().print(theOrganizingProcessRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizingProcess for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizingProcess for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

