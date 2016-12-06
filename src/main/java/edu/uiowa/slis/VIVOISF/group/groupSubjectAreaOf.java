package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupSubjectAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupSubjectAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(groupSubjectAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupSubjectAreaOfIterator thegroupSubjectAreaOfIterator = (groupSubjectAreaOfIterator)findAncestorWithClass(this, groupSubjectAreaOfIterator.class);
			pageContext.getOut().print(thegroupSubjectAreaOfIterator.getSubjectAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing group for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

