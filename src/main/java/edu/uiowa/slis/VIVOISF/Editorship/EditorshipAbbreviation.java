package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			if (!theEditorship.commitNeeded) {
				pageContext.getOut().print(theEditorship.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			return theEditorship.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Editorship for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			theEditorship.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for abbreviation tag ");
		}
	}
}

