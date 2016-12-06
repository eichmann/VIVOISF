package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupSubjectAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupSubjectAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupSubjectAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupSubjectAreaOfIterator thespecial_groupSubjectAreaOfIterator = (special_groupSubjectAreaOfIterator)findAncestorWithClass(this, special_groupSubjectAreaOfIterator.class);
			pageContext.getOut().print(thespecial_groupSubjectAreaOfIterator.getSubjectAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

