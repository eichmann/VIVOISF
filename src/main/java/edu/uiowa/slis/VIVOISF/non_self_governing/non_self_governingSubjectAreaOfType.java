package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingSubjectAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingSubjectAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingSubjectAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingSubjectAreaOfIterator thenon_self_governingSubjectAreaOfIterator = (non_self_governingSubjectAreaOfIterator)findAncestorWithClass(this, non_self_governingSubjectAreaOfIterator.class);
			pageContext.getOut().print(thenon_self_governingSubjectAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

