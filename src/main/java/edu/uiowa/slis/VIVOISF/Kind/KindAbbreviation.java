package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(KindAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			if (!theKind.commitNeeded) {
				pageContext.getOut().print(theKind.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			return theKind.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Kind for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			theKind.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for abbreviation tag ");
		}
	}
}

