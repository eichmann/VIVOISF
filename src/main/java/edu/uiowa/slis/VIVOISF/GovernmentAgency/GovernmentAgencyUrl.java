package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyUrlIterator theGovernmentAgency = (GovernmentAgencyUrlIterator)findAncestorWithClass(this, GovernmentAgencyUrlIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for url tag ");
		}
		return SKIP_BODY;
	}
}

