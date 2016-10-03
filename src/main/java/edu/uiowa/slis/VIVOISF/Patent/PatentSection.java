package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentSection currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentSectionIterator thePatent = (PatentSectionIterator)findAncestorWithClass(this, PatentSectionIterator.class);
			pageContext.getOut().print(thePatent.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for section tag ");
		}
		return SKIP_BODY;
	}
}

