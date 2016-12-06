package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupHasTelephoneIterator thespecial_groupHasTelephoneIterator = (special_groupHasTelephoneIterator)findAncestorWithClass(this, special_groupHasTelephoneIterator.class);
			pageContext.getOut().print(thespecial_groupHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

