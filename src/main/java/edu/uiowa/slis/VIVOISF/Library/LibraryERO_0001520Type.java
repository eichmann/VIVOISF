package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryERO_0001520Iterator theLibraryERO_0001520Iterator = (LibraryERO_0001520Iterator)findAncestorWithClass(this, LibraryERO_0001520Iterator.class);
			pageContext.getOut().print(theLibraryERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

