package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupHasTelephoneIterator thegroupHasTelephoneIterator = (groupHasTelephoneIterator)findAncestorWithClass(this, groupHasTelephoneIterator.class);
			pageContext.getOut().print(thegroupHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

