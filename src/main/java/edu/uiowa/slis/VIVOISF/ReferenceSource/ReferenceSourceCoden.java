package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceCodenIterator theReferenceSource = (ReferenceSourceCodenIterator)findAncestorWithClass(this, ReferenceSourceCodenIterator.class);
			pageContext.getOut().print(theReferenceSource.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for coden tag ");
		}
		return SKIP_BODY;
	}
}

