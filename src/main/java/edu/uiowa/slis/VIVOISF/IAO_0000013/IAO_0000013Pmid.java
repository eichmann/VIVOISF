package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013Pmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013Pmid currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013Pmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013PmidIterator theIAO_0000013 = (IAO_0000013PmidIterator)findAncestorWithClass(this, IAO_0000013PmidIterator.class);
			pageContext.getOut().print(theIAO_0000013.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for pmid tag ");
		}
		return SKIP_BODY;
	}
}

