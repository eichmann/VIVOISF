package edu.uiowa.slis.VIVOISF.OrganizingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizingProcessBFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizingProcessBFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizingProcessBFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizingProcessBFO_0000055Iterator theOrganizingProcessBFO_0000055Iterator = (OrganizingProcessBFO_0000055Iterator)findAncestorWithClass(this, OrganizingProcessBFO_0000055Iterator.class);
			pageContext.getOut().print(theOrganizingProcessBFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizingProcess for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizingProcess for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

