package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryRO_0000053Iterator theLibraryRO_0000053Iterator = (LibraryRO_0000053Iterator)findAncestorWithClass(this, LibraryRO_0000053Iterator.class);
			pageContext.getOut().print(theLibraryRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

