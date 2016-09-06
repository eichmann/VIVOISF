package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565HasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565HasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565HasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565HasEquipmentIterator theERO_0000565HasEquipmentIterator = (ERO_0000565HasEquipmentIterator)findAncestorWithClass(this, ERO_0000565HasEquipmentIterator.class);
			pageContext.getOut().print(theERO_0000565HasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

