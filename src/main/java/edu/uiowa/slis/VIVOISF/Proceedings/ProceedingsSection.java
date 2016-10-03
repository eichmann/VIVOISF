package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsSectionIterator theProceedings = (ProceedingsSectionIterator)findAncestorWithClass(this, ProceedingsSectionIterator.class);
			pageContext.getOut().print(theProceedings.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for section tag ");
		}
		return SKIP_BODY;
	}
}

