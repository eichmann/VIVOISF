package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupOrcidIdInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupOrcidIdInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(groupOrcidIdInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupOrcidIdInverseIterator thegroupOrcidIdInverseIterator = (groupOrcidIdInverseIterator)findAncestorWithClass(this, groupOrcidIdInverseIterator.class);
			pageContext.getOut().print(thegroupOrcidIdInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

