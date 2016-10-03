package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupProducerInverseIterator theGroupProducerInverseIterator = (GroupProducerInverseIterator)findAncestorWithClass(this, GroupProducerInverseIterator.class);
			pageContext.getOut().print(theGroupProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for producer tag ");
		}
		return SKIP_BODY;
	}
}
