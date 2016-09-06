package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumSponsorsIterator theConsortiumSponsorsIterator = (ConsortiumSponsorsIterator)findAncestorWithClass(this, ConsortiumSponsorsIterator.class);
			pageContext.getOut().print(theConsortiumSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

