package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceSiciIterator theReferenceSource = (ReferenceSourceSiciIterator)findAncestorWithClass(this, ReferenceSourceSiciIterator.class);
			pageContext.getOut().print(theReferenceSource.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for sici tag ");
		}
		return SKIP_BODY;
	}
}

