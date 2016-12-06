package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territorySubjectAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territorySubjectAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(territorySubjectAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territorySubjectAreaOfIterator theterritorySubjectAreaOfIterator = (territorySubjectAreaOfIterator)findAncestorWithClass(this, territorySubjectAreaOfIterator.class);
			pageContext.getOut().print(theterritorySubjectAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

