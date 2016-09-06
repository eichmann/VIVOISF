package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumHasEquipmentIterator theConsortiumHasEquipmentIterator = (ConsortiumHasEquipmentIterator)findAncestorWithClass(this, ConsortiumHasEquipmentIterator.class);
			pageContext.getOut().print(theConsortiumHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

