package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryHasEquipmentIterator theLibraryHasEquipmentIterator = (LibraryHasEquipmentIterator)findAncestorWithClass(this, LibraryHasEquipmentIterator.class);
			pageContext.getOut().print(theLibraryHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}

