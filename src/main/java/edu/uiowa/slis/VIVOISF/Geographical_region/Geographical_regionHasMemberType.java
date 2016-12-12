package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionHasMemberType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionHasMemberType currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionHasMemberType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionHasMemberIterator theGeographical_regionHasMemberIterator = (Geographical_regionHasMemberIterator)findAncestorWithClass(this, Geographical_regionHasMemberIterator.class);
			pageContext.getOut().print(theGeographical_regionHasMemberIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

