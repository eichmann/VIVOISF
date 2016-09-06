package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryHasEquipmentIterator theLibraryHasEquipmentIterator = (LibraryHasEquipmentIterator)findAncestorWithClass(this, LibraryHasEquipmentIterator.class);
			pageContext.getOut().print(theLibraryHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

