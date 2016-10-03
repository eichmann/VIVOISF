package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceContentIterator theReferenceSource = (ReferenceSourceContentIterator)findAncestorWithClass(this, ReferenceSourceContentIterator.class);
			pageContext.getOut().print(theReferenceSource.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for content tag ");
		}
		return SKIP_BODY;
	}
}

