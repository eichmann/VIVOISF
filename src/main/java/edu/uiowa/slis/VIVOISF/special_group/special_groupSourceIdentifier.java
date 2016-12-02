package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupSourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupSourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupSourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupSourceIdentifierIterator thespecial_group = (special_groupSourceIdentifierIterator)findAncestorWithClass(this, special_groupSourceIdentifierIterator.class);
			pageContext.getOut().print(thespecial_group.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

