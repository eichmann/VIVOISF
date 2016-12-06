package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryHasSubjectAreaIterator theterritoryHasSubjectAreaIterator = (territoryHasSubjectAreaIterator)findAncestorWithClass(this, territoryHasSubjectAreaIterator.class);
			pageContext.getOut().print(theterritoryHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

