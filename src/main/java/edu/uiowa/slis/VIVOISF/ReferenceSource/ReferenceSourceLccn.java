package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceLccnIterator theReferenceSource = (ReferenceSourceLccnIterator)findAncestorWithClass(this, ReferenceSourceLccnIterator.class);
			pageContext.getOut().print(theReferenceSource.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for lccn tag ");
		}
		return SKIP_BODY;
	}
}

