package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasSubjectAreaIterator theIndividualHasSubjectAreaIterator = (IndividualHasSubjectAreaIterator)findAncestorWithClass(this, IndividualHasSubjectAreaIterator.class);
			pageContext.getOut().print(theIndividualHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

