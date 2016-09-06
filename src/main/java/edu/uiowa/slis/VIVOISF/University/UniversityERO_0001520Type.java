package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityERO_0001520Iterator theUniversityERO_0001520Iterator = (UniversityERO_0001520Iterator)findAncestorWithClass(this, UniversityERO_0001520Iterator.class);
			pageContext.getOut().print(theUniversityERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

