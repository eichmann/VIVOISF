package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupSourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupSourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupSourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupSourceIdentifierIterator theSpecial_group = (Special_groupSourceIdentifierIterator)findAncestorWithClass(this, Special_groupSourceIdentifierIterator.class);
			pageContext.getOut().print(theSpecial_group.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

